package com.msxf.tool.repository;

import com.msxf.tool.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

@Repository
public interface CcsAcctRepository extends JpaRepository<CcsAcct,CcsAcctKey>, JpaSpecificationExecutor<CcsAcct>{

}
