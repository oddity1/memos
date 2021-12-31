package com.aiproject.memos.domain;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemoRepository extends JpaRepository<Memo, Long> {
     List<Memo> findAllByOrderByModifiedAtDesc();
}
    

