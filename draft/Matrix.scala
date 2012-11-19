// so etwas kann man wohl auch noch vereinfacht in triple quote string
// machen, indem man eine kleine dsl mit parser kombinator dafür baut.

var n

row {
  nr -> ""
  fa -> "Fähigkeit"
  ge -> "Gewichtung [1-3]"
  xt -> "Xtext (extern)"
  sc -> "Scala (intern)"
}

row {
  nr -> n += 1
  fa -> "Bla"
  ge -> 2
  xt -> "Blub"
  sc -> "Bli"
}

row {
  nr + fa + ge -> ""
  xt -> "x"
  sc -> ""
}

row {
  nr -> n += 1
  fa -> "DSL als Library bzw. Deployment-möglichkeiten"
  ge -> 2
  xt -> "Ist eine in sich mehr oder weniger geschlossene Struktur."
  sc -> "Interne DSL ist eine ganz normale Scala Library."
}

row {
  nr -> n += 1
  fa -> "Sprach-Infrastruktur"
  ge -> 2
  xt -> "Xtext generiert automatisch ein speziell angepasstes Eclipse Plugin."
  sc -> "Alles wird mitgeliefert, wie z.B. Compiler, Built-Tools. Breite Unterstützung von vielen Editoren."
}

row {
  nr -> n += 1
  fa -> "Strukturierungsfähigkeit des Codes"
  ge -> 2
  xt -> "Muss alles selbst gebaut werden. Vorteil: Es muss nur das nötigste umgesetzt werden."
  sc -> "Sämtliche Infrastruktur vorhanden. (Packages, Kontrollstrukturen, Build-Tools, ...)"
}

row {
  nr -> n += 1
  fa -> "DSL mit General Purpose mischbar"
  ge -> 2
  xt -> "Hat viele Hürden, um eine DSL mehr Allgemeingültigkeit zu verpassen"
  sc -> "Alle Scala-Fähigkeiten nativ nutzbar, da die DSL eine normale Library ist."
}

row {
  nr -> n += 1
  fa -> "Toolsets (für DSL Gestaltung)"
  ge -> 2
  xt -> "Komplette und entsprechend angepasste Eclipse Entwicklungsumgebung."
  sc -> "Die Sprace selbst, sonst keine Hilfen."
}

row {
  nr -> n += 1
  fa -> "Erweiterbarkeit durch Entwickler"
  ge -> 2
  xt -> "Grammatik, Tests und Generator kann nach belieben wachsen, u.a. Unterstützung durch Eclipse."
  sc -> "Der Aufwand liegt bei der Entwicklung einer Library. Jedoch müssen Testumgebungen etc. selbst eingerichtet werden."
}

row {
  nr -> n += 1
  fa -> "Erweiterbarkeit durch Domain User/Community (z.B. für eigene Templates)"
  ge -> 2
  xt -> "Es würde von dem Domain User verlangt werden BNF-Notation zu können, Xtend und er wäre auf Eclipse gezwungen."
  sc -> "Einfache Scala Kenntnisse plus eine kleine Anleitung sollten ausreichen."
}

row {
  nr -> n += 1
  fa -> "Wiederverwendbarkeit bzw. Kombination mit Vorhandenem"
  ge -> 2
  xt -> "Nur eingeschränkt, Grammatik unterstützt keine Vererbung oder ähnliches."
  sc -> "Sehr gut, da Library und mit Scalas Typ und Vererbungssystem kann nach gewohnter Manier kombiniert und erweitert werden."
}

row {
  nr -> n += 1
  fa -> "Grammatikalische Gestaltung der DSL"
  ge -> 2
  xt -> "Komplett frei und flexibel, da in BNF-Regeln definiert."
  sc -> "Eingeschränkt, man bleibt an Scala's Beschränkungen gebunden."
}

// TODO überarbeiten!:

row {
  nr -> n += 1
  fa -> "Generator"
  ge -> 2
  xt -> "Ohne Umwege kann jede Sprache oder Markup aus dem DSL-Modell generiert werden."
  sc -> "Es müssen immer Umwege genommen werden, wenn eine fremde Sprache das Ziel ist. Wenn Scala das Ziel ist, muss nichteinmal die Laufzeitumgebung verlassen werden."
}

// wo läuft der code? Scala (intern) -> direkt

row {
  nr -> n += 1
  fa -> "Zielarchitektur (siehe Buch, welches Generator wo läuft)"
  ge -> 2
  xt -> ""
  sc -> ""
}

row {
  nr -> n += 1
  fa -> "Entwicklungsaufwand (u.a. Zeit, Einarbeitung)"
  ge -> 2
  xt -> "Wenn BNF-Kenntnisse (th. Informatik) vorhanden sind, leichte Einarbeitung. Die Tools nehmen die harte Arbeit ab. Es gibt schon standardisierte Vorgehensweisen, z.B. wie der Generator gebaut wird."
  sc -> "Wenn Scala-Kenntnisse vorhanden, ist es mehr oder weniger die Entwicklung einer Library. Wie man den Generator baut, muss allerdings überlegt werden."
}

row {
  nr -> n += 1
  fa -> "Software-Lebenszyklus und Wartbarkeit"
  ge -> 2
  xt -> "Dank IDE und einer schon eingerichteten Testumgebung, also sehr gut."
  sc -> "Man hat alle Möglichkeiten, die die Scala-Welt bietet, also sehr gut. Jedoch ist Handarbeit nötig."
}

row {
  nr -> n += 1
  fa -> "Skalierbarkeit"
  ge -> 2
  xt -> "Kommt auf das Generat an. Man ist und bleibt an Eclipse gebunden."
  sc -> "Scala selbst ist in alle Richtungen (Größe, Nebenläufigkeit) sehr gut Skalierbar."
}

