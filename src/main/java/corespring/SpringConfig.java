package corespring;


import org.springframework.context.annotation.*;

@ComponentScan("corespring")
@Configuration
public class SpringConfig 
{
  @Bean
  public BinarySearchImpl binarySearchImpl()
  {
      return new BinarySearchImpl();
  }
  
}