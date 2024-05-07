package org.zerock.b01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.b01.domain.Board;

//JpaRepository 상속후 <테이블클래스명, ID 타입>
public interface BoardRepository extends JpaRepository<Board, Long> {
    //CRUD 자동 생성
}
