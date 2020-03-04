package com.cts.adb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.adb.Entity.GroupEntity;

@Repository
public interface GroupRepository extends JpaRepository<GroupEntity,String> {

}
