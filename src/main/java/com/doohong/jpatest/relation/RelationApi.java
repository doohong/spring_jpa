package com.doohong.jpatest.relation;

import com.doohong.jpatest.relation.domain.Relation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/test")
@RequiredArgsConstructor
public class RelationApi {
    private final RelationRepositorySupport relationRepositorySupport;
    public ResponseEntity<List<Relation>> test(@RequestParam("no")int no){

        return ResponseEntity.ok().body(relationRepositorySupport.findBySubjectId(no));

    }
}
