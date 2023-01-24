package com.zerobase.fastlms.member.controller;

import com.zerobase.fastlms.member.entity.Member;
import com.zerobase.fastlms.member.model.MemberInput;
import com.zerobase.fastlms.member.repository.MemberRepository;
import com.zerobase.fastlms.member.service.MemberService;
import java.time.LocalDateTime;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
public class MemberController {

  private final MemberService memberService;

  @GetMapping("/member/register")
  public String register() {
    return "member/register";
  }

  @PostMapping("/member/register")
  public String registerSubmit(Model model, HttpServletRequest request,
      HttpServletResponse response, MemberInput parameter) {

    boolean result = memberService.register(parameter);

    model.addAttribute("result", result);

    return "member/register_complete";
  }
}
