package com.ceshishi.demo1.repository;

import com.ceshishi.demo1.core.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface ContactReprository extends JpaRepository<Contact,Integer> {

    Contact getAllByContactId(Integer contactId);


    @Query("select c from Contact c where c.mobile like %:mobile%")
    List<Contact> queryAllByMobile(@Param("mobile") String mobile);

    @Modifying
    @Query("update Contact  t set t.mobile = :mobile where t.contactId = :id")
    void updateContactById(@Param("id") Integer id,@Param("mobile") String mobile);
}
