package cn.bywind.boot.service.impl;

import cn.bywind.boot.dao.PersonDao;
import cn.bywind.boot.model.PersonDo;
import cn.bywind.boot.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonDao personDao;


    @Override
    public List<PersonDo> queryPersonlist(HashMap<String, Object> params) {
        return personDao.queryPersonlist(params);
    }

    @Override
    public PersonDo getPerson(HashMap<String, Object> params) {
        return personDao.getPerson(params);
    }

    @Override
    public int addPerson(PersonDo personDo) {
        return personDao.addPerson(personDo);
    }

    @Override
    public int updatePerson(HashMap<String, Object> params)
    {
        int result = personDao.updatePerson(params);
        return result;
    }
}
