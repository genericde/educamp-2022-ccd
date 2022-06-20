using System.IO;
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
        var stringWriter = new StringWriter(stringBuilder);
        var printer = new Printer(stringWriter);

        var sut = new FizzBuzzIntegration(printer);
        sut.FizzBuzz();

        stringBuilder.ToString().Should().MatchSnapshot();
    }
}