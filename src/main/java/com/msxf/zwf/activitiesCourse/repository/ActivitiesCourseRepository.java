package com.msxf.zwf.repository;

import com.msxf.zwf.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

@Repository
public interface ActivitiesCourseRepository extends JpaRepository<ActivitiesCourse,Long>, JpaSpecificationExecutor<ActivitiesCourse>{

}
