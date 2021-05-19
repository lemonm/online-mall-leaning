package lemon.onlinemall.service;

import lemon.onlinemall.mbg.model.PmsBrand;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * PmsBrandService
 * <p>
 * Created by macro on 2019/4/19.
 */
@Component
public interface PmsBrandService {
    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);
}
