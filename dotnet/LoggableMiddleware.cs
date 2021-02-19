using System;
using System.Threading;
using System.Threading.Tasks;
using MediatR;

namespace dotnet
{
    public class LoggableMiddleware<TRequest, TResponse> : IPipelineBehavior<TRequest, TResponse>
    {
        public async Task<TResponse> Handle(TRequest request, CancellationToken cancellationToken, RequestHandlerDelegate<TResponse> next)
        {
            Console.WriteLine("Logging stuff.");
            
            return await next();
        }
    }
}