using System.Text;
using FluentAssertions;
using NUnit.Framework;
using Snapshooter.NUnit;

namespace FizzBuzz.Tests;

public class FizzBuzzIntegrationTests
{
    [Test]
    public void FizzBuzz_AcceptanceTest()
    {
        var stringBuilder = new StringBuilder();

        FizzBuzzIntegration.Run(s => stringBuilder.AppendLine(s));

        stringBuilder.ToString().Should().MatchSnapshot();
    }
}