package redis;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerRedisTest {
	@RequestMapping("/redisMap")
   public Map<String,String> redisMap() {
	   Map<String,String> s=new HashMap<String,String>(); ;
	   s.put("1", "aad");
	   s.put("2", "sdsd");
	   return s;
   }
}
