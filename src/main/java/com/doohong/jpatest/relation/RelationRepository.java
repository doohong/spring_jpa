package com.doohong.jpatest.relation;

import com.doohong.jpatest.relation.domain.Relation;
import com.doohong.jpatest.relation.domain.RelationKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RelationRepository extends JpaRepository<Relation, RelationKey> {
}
