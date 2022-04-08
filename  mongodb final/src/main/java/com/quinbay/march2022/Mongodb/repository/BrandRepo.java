
package com.quinbay.march2022.Mongodb.repository;

        import com.quinbay.march2022.Mongodb.dto.Brands;
        import org.springframework.data.mongodb.repository.MongoRepository;
        import org.springframework.stereotype.Repository;

        import java.util.List;

@Repository
public interface   BrandRepo extends MongoRepository<Brands,String> {


}
