package com.doohong.jpatest.relation;

import com.doohong.jpatest.relation.domain.QRelation;
import com.doohong.jpatest.relation.domain.Relation;
import com.doohong.jpatest.subject.domain.QSubject;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.doohong.jpatest.relation.domain.QRelation.relation;

@Repository

public class RelationRepositorySupport extends QuerydslRepositorySupport {

    private final JPAQueryFactory jpaQueryFactory;


    public RelationRepositorySupport(JPAQueryFactory jpaQueryFactory){
        super(Relation.class);
        this.jpaQueryFactory = jpaQueryFactory;
    }
    public List<Relation> findBySubjectId(Integer subjectId){
        QSubject subject = QSubject.subject;
        QRelation relation = QRelation.relation;

        return jpaQueryFactory
                .selectFrom(relation)
                .leftJoin(relation.relationId.subject,subject)
                .where(relation.relationId.subject.subjectId.eq(subjectId)).fetch();
    }

}
