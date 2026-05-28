package kr.ac.hansung.repository;

import kr.ac.hansung.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    long countByStockEquals(int stock);
    Page<Product> findByNameContainingIgnoreCase(String keyword, Pageable pageable);
}
