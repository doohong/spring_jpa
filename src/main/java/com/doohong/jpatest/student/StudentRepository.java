package com.doohong.jpatest.student;

import com.doohong.jpatest.relation.domain.Relation;
import com.doohong.jpatest.relation.domain.RelationKey;
import com.doohong.jpatest.student.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
