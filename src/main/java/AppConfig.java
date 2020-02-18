import com.example.model.Speaker;
import com.example.repository.HibernateSpeakerRepositoryImpl;
import com.example.repository.SpeakerRepository;
import com.example.service.SpeakerService;
import com.example.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan({"com.example"})
public class AppConfig {

//    @Bean(name = "speakerService")
//    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
//    public SpeakerService getSpeakerService() {
//        SpeakerService service = new SpeakerServiceImpl();
//        //SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
//        //service.setRepository(getSpeakerRepository());
//        return service;
//    }
//
//    @Bean(name = "SpeakerRepository")
//    public SpeakerRepository getSpeakerRepository () {
//        return new HibernateSpeakerRepositoryImpl();
//    }
}
