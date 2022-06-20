namespace LocCount.Tests;

public class LocCounterTests
{
    [Test]
    public void SingleLineCommentsAreNotCounted()
    {
        var result =
            LocCounter.CountLinesOfCode(new[] { "var x = 0", "// Comment", "var b = 1 + c; // inline comment" });

        Assert.That(result, Is.EqualTo(2));
    }

    [Test]
    public void EmptyLinesAreNotCounted()
    {
        var result =
            LocCounter.CountLinesOfCode(new[] { " ", "var b = 1 + c;    \t", "\t", "" });

        Assert.That(result, Is.EqualTo(1));
    }
}