using System;
using System.Threading.Tasks;
using dotnet.Queries.AddTwoNumbers;
using MediatR;
using Microsoft.Extensions.DependencyInjection;

namespace dotnet
{
    class Program
    {
        private readonly IMediator mediator;

        public Program(
            IMediator mediator) 
        {
            this.mediator = mediator;
        }

        private async Task RunAsync() {
            var result = await mediator.Send(new AddTwoNumbersQuery(2, 4));
            Console.WriteLine("The result is " + result);
        }

        static async Task Main()
        {
            var services = new ServiceCollection();
            services.AddMediatR(typeof(Program));
            services.AddScoped<Program>();
            services.AddScoped(typeof(IPipelineBehavior<,>), typeof(LoggableMiddleware<,>));

            var serviceProvider = services.BuildServiceProvider();

            var program = serviceProvider.GetRequiredService<Program>();
            await program.RunAsync();
        }
    }
}
