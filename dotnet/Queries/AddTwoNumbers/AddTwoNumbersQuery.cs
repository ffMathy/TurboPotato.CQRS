using MediatR;

namespace dotnet.Queries.AddTwoNumbers {
    public record AddTwoNumbersQuery(
        int FirstNumber, 
        int SecondNumber) : IRequest<int>;
}