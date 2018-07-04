
package quality;

import java.util.Date;

public class Member
{
    private String id;
    private String sin;
    private Date startDate;
    private Date endDate;

    public Member() {
        super();
    }

    public Member(String id, Date startDate, Date endDate) {
        super();
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getId()
    {
        return this.id;
    }

    public String getSin()
    {
        return this.sin;
    }

    public void setSin(String sin)
    {
        this.sin = sin;
    }

    public Date getStartDate()
    {
        return this.startDate;
    }

    public Date getEndDate()
    {
        return this.endDate;
    }
}