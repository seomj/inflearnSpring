package hello.hello_spring.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// JPA Entity (데이터베이스의 테이블과 매핑)
@Entity
public class Member {

    @Id // 기본 키 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 기본 키의 값을 어떻게 생성할지 지정

    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
