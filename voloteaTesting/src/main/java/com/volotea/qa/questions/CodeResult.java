package com.volotea.qa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.volotea.qa.userInterfaces.Origin.CODE_RESULT;

public class CodeResult implements Question <String> {
    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the((CODE_RESULT), WebElementStateMatchers.isVisible()));
        return Text.of(CODE_RESULT).viewedBy(actor).asString();
    }
    public static CodeResult codeResult(){
        return new CodeResult();
    }
}
