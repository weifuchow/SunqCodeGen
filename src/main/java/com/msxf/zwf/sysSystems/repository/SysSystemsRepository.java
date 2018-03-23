package com.msxf.zwf.sysSystems.repository;

import com.msxf.zwf.sysSystems.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

@Repository
public interface SysSystemsRepository extends JpaRepository<SysSystems,Long>, JpaSpecificationExecutor<SysSystems>{

}
