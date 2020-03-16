package com.gao.service.Impl;

import com.gao.dao.PetDao;
import com.gao.pojo.Pet;
import com.gao.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class PetServiceImpl implements PetService {

    @Autowired
    private PetDao tagDao;

    @Override
    public int saveTag(Pet tag) {
        return tagDao.saveTag(tag);
    }

    @Override
    public int deleteTag(Long id) {
        return tagDao.deleteTag(id);
    }

    @Override
    public int updateTag(Pet tag) {
        return tagDao.updateTag(tag);
    }

    @Override
    public Pet getById(Long id) {
        return tagDao.getById(id);
    }

    @Override
    public Pet getByName(String name) {
        return tagDao.getByName(name);
    }

    @Override
    public List<Pet> getAllTag() {
        return tagDao.getAllTag();
    }

    @Override
    public List<Pet> getTagByString(String text) {
        List<Pet> tags = new ArrayList<>();
        List<Long> longs = convertToList(text);
        for (Long aLong : longs) {
            tags.add(tagDao.getById(aLong));
        }
        return tags;

    }

    @Override
    public List<Pet> getAdminTag() {
        return tagDao.getAdminTag();
    }

    private List<Long> convertToList(String ids) {
        List<Long> list = new ArrayList<>();
        if (!"".equals(ids) && ids != null) {
            String[] idarray = ids.split(",");
            for (int i=0; i < idarray.length;i++) {
                list.add(new Long(idarray[i]));
            }
        }
        return list;
    }
}
