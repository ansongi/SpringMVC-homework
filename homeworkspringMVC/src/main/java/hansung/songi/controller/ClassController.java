package hansung.songi.controller;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;

import hansung.songi.model.Class;
import hansung.songi.service.ClassService;

@Controller
public class ClassController {

	private ClassService cService;
	@Autowired
	public ClassController(ClassService cService) {
		this.cService = cService;
	}
	@RequestMapping("/year_semester") //1. 학기별 이수학점 조회
	public String showclassYear(Model model){
		List<Map<String,Object>>credityear=cService.getyearCredit();
		model.addAttribute("year131",credityear.get(0).get("학점"));
		model.addAttribute("year132",credityear.get(1).get("학점"));
		model.addAttribute("year141",credityear.get(2).get("학점"));
		model.addAttribute("year142",credityear.get(3).get("학점"));
		model.addAttribute("year161",credityear.get(4).get("학점"));
		model.addAttribute("year162",credityear.get(5).get("학점"));
		return "showyear"; //view 이름
	}
	/////////////////////////////////////////////////////////학기별 수강 교과목
	@RequestMapping("/13-1")
	public String showclass1(Model model){
		List<Map<String, Object>> class13and1= cService.getNameList(2013,1);
		model.addAttribute("class13and1", class13and1);
		return "13-1"; 
	}
	@RequestMapping("/13-2")
	public String showclass2(Model model){
		List<Map<String, Object>> class13and2= cService.getNameList(2013,2);
		model.addAttribute("class13and2", class13and2);
		return "13-2"; 
	}
	@RequestMapping("/14-1")
	public String showclass3(Model model){
		List<Map<String, Object>> class14and1= cService.getNameList(2014,1);
		model.addAttribute("class14and1", class14and1);
		return "14-1"; 
	}
	@RequestMapping("/14-2")
	public String showclass4(Model model){
		List<Map<String, Object>> class14and2= cService.getNameList(2014,2);
		model.addAttribute("class14and2", class14and2);
		return "14-2"; 
	}
	@RequestMapping("/16-1")
	public String showclass5(Model model){
		List<Map<String, Object>> class16and1= cService.getNameList(2016,1);
		model.addAttribute("class16and1", class16and1);
		return "16-1"; 
	}
	@RequestMapping("/16-2")
	public String showclass6(Model model){
		List<Map<String, Object>> class16and2= cService.getNameList(2016,2);
		model.addAttribute("class16and2", class16and2);
		return "16-2"; 
	}
	@RequestMapping("/shownew") // 수강신청할 학기
	public String showclass7(Model model){
		List<Map<String, Object>> class17and1= cService.getNameList(2017,1);
		if(class17and1.isEmpty()){
			String msg = "수강한 과목이 없습니다.";
			model.addAttribute("msg",msg);
		}
		else
			model.addAttribute("class17and1", class17and1);
		return "shownew";
	}
	////////////////////////////////////////학기별 출력
	
	@RequestMapping("/class_division") //2. 이수구분별 학점 내역 조회
	public String createclassDivision(Model model){
		List<Map<String,Object>>creditdivision=cService.getDivisionList();
		model.addAttribute("sumclass1",creditdivision.get(0).get("학점"));//교필
		model.addAttribute("sumclass2",creditdivision.get(1).get("학점"));//일교
		model.addAttribute("sumclass3",creditdivision.get(2).get("학점"));//전기
		model.addAttribute("sumclass4",creditdivision.get(3).get("학점"));//전선
		model.addAttribute("sumclass5",creditdivision.get(4).get("학점"));//전지
		model.addAttribute("sumclass6",creditdivision.get(5).get("학점"));//핵교a
		model.addAttribute("sumclass7",creditdivision.get(6).get("학점"));//핵교b
		return "showdivision";
	}
	////////////////////////////////////////////////////////////////////////////////////
	@RequestMapping("/newclass") //3. 수강신청하기
	public String createclass(Model model){	
		model.addAttribute(new Class());
		return "createclass";
	}
	@RequestMapping("/docreate")
	public String doCreate(Model model,Class classes){ 
		cService.insert(classes); //db에 삽입
		List<Class> classList = cService.getCurrent();
		model.addAttribute("classes",classList);
		return "docreate"; 
	}
	///////////////////////////////////////////////////////////////////////////////////////
	@RequestMapping("/newclassview") //4.수강신청 조회
	public String newclassview(Model model){
		List<Class> classes= cService.getNewClass();
		model.addAttribute("classes",classes);
		return "newclassview";
	}

}
