package com.zerobase.fastlms;

import com.zerobase.fastlms.member.components.MailComponents;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@RequiredArgsConstructor
@Controller
public class MainController {

  private final MailComponents mailComponents;

  @RequestMapping("/")
  public String index() {
/*

    String email = "ahraeha@naver.com";
    String subject = " 안녕하세요. 제로베이스 테스트입니다.";
    String text = "<p>안녕하세요. </p><p>반갑습니다.</p>";

    mailComponents.sendMail(email, subject, text);
*/

    return "index";
  }



}

/*
  @RequestMapping("/hello")
  public void hello(HttpServletRequest request, HttpServletResponse response) throws IOException {
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter printWriter = response.getWriter();
    String msg = "<html>" +
        "<head>" +
        "</head>" +
        "<body>" +
        "<p>hello</p> <p>fastlms website!!!</p>" +
        "<p> 안녕하세요!!! </p> " +
        "</body>" +
        "</html>";

    printWriter.write(msg);
    printWriter.close();
  }
 */