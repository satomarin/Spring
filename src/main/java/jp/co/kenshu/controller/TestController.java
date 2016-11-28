package jp.co.kenshu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.kenshu.dto.test.TestDto;
import jp.co.kenshu.service.TestService;

@Controller
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/test/{id}", method = RequestMethod.GET)
    public String test(Model model, @PathVariable int id) {
        TestDto test = testService.getTest(id);
        model.addAttribute("message", "MyBatisのサンプルです");
        model.addAttribute("test", test);
        return "test";
    }

    @RequestMapping(value = "/test/", method = RequestMethod.GET)
    public String testAll(Model model) {
        List<TestDto> tests = testService.getTestAll();
        model.addAttribute("message", "MyBatisの全件取得サンプルです");
        model.addAttribute("tests", tests);
        return "testAll";
    }

    @RequestMapping(value = "/test/dto/{id}", method = RequestMethod.GET)
    public String testDto(Model model, @PathVariable int id) {
    	TestDto dto = new TestDto();
    	dto.setId(id);
    	TestDto test = testService.getTestByDto(dto);
        model.addAttribute("message", "MyBatisのサンプルです");
        model.addAttribute("test", test);
        return "test";
    }
}