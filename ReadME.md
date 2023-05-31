@Builder - using to convert a model to builder pattern

@Slf4j - slf4j logs

we can provide the response entity as follows
1. Can keep the return type as void
2. @ResponseStatus(HttpStatus.CREATED)
3. no need to return new ResponseEntity(HttpStatus.OK);


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest){

    }

Not like Relational databases, There are no any ORM, So cannot use the JPARepository. 
Instead of need to use the 

**MongoRepository<Product, Integer>**


And need to use the @Document to create the document. this is same like we using @Table in mysql.

    @Document(value = "product")
    public class Product {
        @Id
        private String id;
        private String data;
        private String description;
        private BigDecimal price;
    }

@RequiredArgsConstructor - this using to create an constructor to the **final** or **@NotNull** variables. When we using @RequiredArgConstructor, the compiler will automatically creates a constructor. 

    @RequiredArgsConstructor
    public class MyService {
        private final MyRepository myRepository;
        private final AnotherDependency anotherDependency;
    }

If we needed we can use the model to sent in the response of the REST APIS, but that is not a good practise
we should use DTO to do that. Because Model classes should not expose to the outside. 

    dto
      ProductResponse
    model
      Product

In this case we don't send the Product as the response, instead of that we sending the ProductResponse dto.