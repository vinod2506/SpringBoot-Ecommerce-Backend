package in.nit.api.service;

import java.util.List;

import in.nit.api.entity.ProductCategory;

/**
 * Created By Zhu Lin on 3/10/2018.
 */
public interface CategoryService {

    List<ProductCategory> findAll();

    ProductCategory findByCategoryType(Integer categoryType);

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);


}
