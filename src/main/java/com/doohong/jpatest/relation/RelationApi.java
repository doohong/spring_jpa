package com.doohong.jpatest.relation;

import com.doohong.jpatest.relation.domain.Relation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping(value = "/test")
@RequiredArgsConstructor
public class RelationApi {
    private final RelationRepositorySupport relationRepositorySupport;
    @RequestMapping(value = "/test")
    public ResponseEntity<List<Relation>> test(@RequestBody HashMap<String,Integer> req){
        int no = req.get("no");
        System.out.println(no);
        return ResponseEntity.ok().body(relationRepositorySupport.findBySubjectId(no));

    }
}
