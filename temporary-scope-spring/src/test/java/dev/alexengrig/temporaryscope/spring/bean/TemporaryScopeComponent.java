package dev.alexengrig.temporaryscope.spring.bean;

import dev.alexengrig.temporaryscope.spring.SpringTemporaryScopeTest;
import dev.alexengrig.temporaryscope.spring.TemporaryScope;
import dev.alexengrig.temporaryscope.spring.WithCreatedAt;
import org.springframework.stereotype.Component;

@Component
@TemporaryScope(SpringTemporaryScopeTest.AMOUNT)
public class TemporaryScopeComponent extends WithCreatedAt {
}
