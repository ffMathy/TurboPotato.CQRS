using System.Threading;
using System.Threading.Tasks;
using MediatR;

namespace dotnet.Queries.AddTwoNumbers {
    public class AddTwoNumbersQueryHandler : IRequestHandler<AddTwoNumbersQuery, int>
    {
        public async Task<int> Handle(AddTwoNumbersQuery request, CancellationToken cancellationToken)
        {
            return request.FirstNumber + request.SecondNumber;
        }
    }
}