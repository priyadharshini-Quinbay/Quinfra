
package com.quinbay.march2022.Mongodb.repository;


        import com.quinbay.march2022.Mongodb.dt.Analysis;
        import org.springframework.data.mongodb.repository.MongoRepository;
        import org.springframework.stereotype.Repository;

        import java.util.List;

@Repository
public interface AnalysisRepository extends MongoRepository<Analysis, String> {

}