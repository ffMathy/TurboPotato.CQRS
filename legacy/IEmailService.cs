namespace legacy
{
    public interface IEmailService
    {
        public void SendEmail(string recipient, string content);
    }
}