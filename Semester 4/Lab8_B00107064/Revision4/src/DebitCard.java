import java.util.Date;

public class DebitCard
{
    private String nameOnCard;
    private Date expiryDate;
    private Date dateOfIssue;
    private String cvnNumber;

    public DebitCard()
    {
        this.nameOnCard = "Empty Field";
        this.expiryDate = new Date();
        this.dateOfIssue = new Date();
        this.cvnNumber = "Empty Field";
    }

    public DebitCard(String nameOnCard, Date expiryDate, String cvnNumber)
    {
        this.nameOnCard = nameOnCard;
        this.expiryDate = expiryDate;
        this.cvnNumber = cvnNumber;
        this.dateOfIssue = new Date();
    }

    public DebitCard(String nameOnCard, Date expiryDate, Date dateOfIssue, String cvnNumber)
    {
        this.nameOnCard = nameOnCard;
        this.expiryDate = expiryDate;
        this.dateOfIssue = dateOfIssue;
        this.cvnNumber = cvnNumber;
    }
    
    @Override
    public String toString()
    {
        return "DebitCard (" +
                "Name On Card = " + nameOnCard  +
                ", Expiry Date = " + expiryDate +
                ", Date Of Issue = " + dateOfIssue +
                ", CVNNumber = " + cvnNumber +
                ')';
    }
}
