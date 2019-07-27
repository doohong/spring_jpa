package com.doohong.jpatest.subject;

import com.doohong.jpatest.relation.domain.Relation;
import com.doohong.jpatest.relation.domain.RelationKey;
import com.doohong.jpatest.subject.domain.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Integer> {
}
