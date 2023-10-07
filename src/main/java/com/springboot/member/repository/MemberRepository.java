package com.springboot.member.repository;


import com.springboot.member.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<MemberEntity, Long> {
    // 이메일로 회원 정보 조회 (select * from member_table where member_email=?)
    // Optional은 일종의 null 방지를 해준다.
    Optional<MemberEntity> findByMemberEmail(String memberEmail);
}
