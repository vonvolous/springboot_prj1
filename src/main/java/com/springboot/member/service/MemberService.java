package com.springboot.member.service;

import com.springboot.member.dto.MemberDTO;
import com.springboot.member.entity.MemberEntity;
import com.springboot.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public void save(MemberDTO memberDTO) {
        // 1. dto -> entity로 변환
        MemberEntity memberEntity = MemberEntity.toMemberEntity(memberDTO);

        // 2. repository의 save 메서드 호출(조건, entity 객체를 넘겨줘야 함)
        memberRepository.save(memberEntity);

    }
}
