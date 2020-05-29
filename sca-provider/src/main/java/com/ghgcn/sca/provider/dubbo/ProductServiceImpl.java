//package com.ghgcn.sca.provider.dubbo;
//
//import com.ghgcn.sca.domain.Product;
//import com.ghgcn.sca.dubbo.api.ProductService;
//import com.ghgcn.sca.provider.dao.ProductDao;
//import org.apache.dubbo.config.annotation.Service;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.Optional;
//
//@Service
//public class ProductServiceImpl implements ProductService {
//
//    @Autowired
//    private ProductDao productDao;
//
//    @Override
//    public Product findByPid(Integer pid) {
//        Optional<Product> optional = productDao.findById(pid);
//        if (optional.isPresent()) {
//            return optional.get();
//        }
//        return null;
//    }
//
//    @Override
//    public void reduceInventory(Integer pid, Integer number) {
//        Optional<Product> optional = productDao.findById(pid);
//        if (!optional.isPresent()) {
//            throw new RuntimeException("当前pid " + pid + "  商品不存在");
//        }
//        Product product = optional.get();
//
//        if (product.getStock() < number) {
//            throw new RuntimeException("当前pid " + pid + "  商品库存 " + product.getStock() + " 小于扣减库存: " + number);
//        }
//        product.setStock(product.getStock() - number);
//        productDao.save(product);
//    }
//}
