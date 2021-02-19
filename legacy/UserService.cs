using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace legacy
{
    class UserService
    {
        private readonly IEmailService _emailService;
        private readonly IUserRepository _userRepository;

        public UserService(
            IEmailService emailService,
            IUserRepository userRepository)
        {
            _emailService = emailService;
            _userRepository = userRepository;
        }

        public User CreateUser(
            string username, 
            string email)
        {
            var user = new User() {
                Username = username,
                Email = email
            };
            _userRepository.CreateUser(user);
            _emailService.SendEmail(email, "Waaaazzzaaaaaaaaaaaa!");

            return user;
        }

        public void SendPasswordRecoveryEmail(User user)
        {
            _emailService.SendEmail(user.Email, "Forgot your password? Too bad.");
        }
    }
}
