package lemon.onlinemall.serviceimpl;

import com.github.pagehelper.PageHelper;
import lemon.onlinemall.mbg.mapper.PmsBrandMapper;
import lemon.onlinemall.mbg.model.PmsBrand;
import lemon.onlinemall.mbg.model.PmsBrandExample;
import lemon.onlinemall.service.PmsBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * PmsBrandService实现类
 * <p>
 * Created by macro on 2019/4/19.
 */
@Service("PmsBrandService")
public class PmsBrandServiceImpl implements PmsBrandService {
    @Autowired
    private PmsBrandMapper brandMapper;

    @Override
    public List<PmsBrand> listAllBrand() {
        return brandMapper.selectByExample(new PmsBrandExample());
    }

    @Override
    public int createBrand(PmsBrand brand) {
        return brandMapper.insertSelective(brand);
    }

    @Override
    public int updateBrand(Long id, PmsBrand brand) {
        brand.setId(id);

        return brandMapper.updateByPrimaryKeySelective(brand);
    }

    @Override
    public int deleteBrand(Long id) {
        return brandMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<PmsBrand> listBrand(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);

        brandMapper.selectByExample(new PmsBrandExample());

        return brandMapper.selectByExample(new PmsBrandExample());
    }

    @Override
    public PmsBrand getBrand(Long id) {
        return brandMapper.selectByPrimaryKey(id);
    }
}
