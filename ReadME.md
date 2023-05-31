@Builder - using to convert a model to builder pattern

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