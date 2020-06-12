package in.nit.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nit.api.entity.ProductCategory;

import java.util.List;

/**
 * Created By Zhu Lin on 3/9/2018.
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {
    // Some category
    List<ProductCategory> findByCategoryTypeInOrderByCategoryTypeAsc(List<Integer> categoryTypes);
    // All category
    List<ProductCategory> findAllByOrderByCategoryType();
    // One category
    ProductCategory findByCategoryType(Integer categoryType);
}
