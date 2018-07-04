package quality;

public class MemberRepositoryImpl implements MemberRepository
{
    private Logger logger;
    private MemberDataRepository memberDataRepository;
    
    public MemberRepositoryImpl() {
        super();

        this.logger = LogManager.getLogger();
        this.memberDataRepository = new MemberDataRepository();
        this.memberDataRepository.Init();
    }

    public Member searchMember(String id, String sin)
    {
        if (id == null || String.isEmpty(id))
        {
            throw new RuntimeException("id canno be null or empty.")
        }

        this.logger.log("Searching for member.")

        Member result = new Member()
        result = this.MemberDataRepository(id, sin)

        return result;
    }
}