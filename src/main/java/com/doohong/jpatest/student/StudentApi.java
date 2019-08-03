package com.doohong.jpatest.student;


import com.doohong.jpatest.relation.domain.Relation;
import com.doohong.jpatest.student.domain.Student;
import com.doohong.jpatest.subject.domain.Subject;
import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;

@Controller
@RequestMapping(value = "/test")
@RequiredArgsConstructor
public class StudentApi {
    private final StudentRepository studentRepository;
    @RequestMapping(value = "/test2")
    public ResponseEntity<List<Subject>> test(@RequestBody HashMap<String,String> req){
        String name = req.get("name");
        System.out.println(name);
        Student student = studentRepository.findByStudentName(name);
        System.out.println(student.toString());
        System.out.println(student.getRelationList().size());
        List<Subject> subjectsList = new ArrayList<>();



            for (Relation relation : student.getRelationList()){

                subjectsList.add(relation.getRelationId().getSubject());
            }

        return ResponseEntity.ok().body(subjectsList);

    }
}
