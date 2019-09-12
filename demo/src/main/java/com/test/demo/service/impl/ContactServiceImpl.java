package com.test.demo.service.impl;

import com.test.demo.repository.ContactReprository;
import com.test.demo.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    ContactReprository contactReprository;

    @Transactional
    @Override
    public void updateContactById(Integer id, String mobile) {
        contactReprository.updateContactById(id,mobile);
    }
}
