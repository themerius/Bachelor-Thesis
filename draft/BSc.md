# Einleitung

Die Idee entstammt der Zeit als ich mein Praxissemester beim Fraunhofer ISE gemacht habe, da die Tools zur automatischen Dokumentengenerierung, genauer den Jahresbericht, alle weniger geeignet erschienen. Die gewünschten Fähigkeiten müssen über mehrere Tools zusammenlaufen, welche nicht immer ideal zusammenarbeiten; z.B. LaTeX plus Microsoft Word. Ab da an tüftelte ich daran, wie diesem Umstand Besserung gelingen kann.

Wie schon erwähnt handelt es sich um ein Tool, welches automatische Dokumentengenerierung ermöglichen soll. Für diese oder ähnliche Aufgaben gibt es bereits zahlreiche andere Werkzeuge:

* LaTeX,
* Word, OpenOffice,
* Google Docs,
* ...

Um einige Beispiele zu nennen.

Jedes dieser Werkzeuge hat seine individuellen Vor- und Nachteile. Aber diese Bachelor-Thesis will einen anderen Ansatz ausprobieren, und seine Machbarkeit, Praxistauglichkeit und Weiterentwicklungsmöglichkeiten festzustellen bzw. zu überprüfen.

## Die Idee

Wie wäre es, wenn als Dokument-Endprodukt eine HTML/CSS/JS-Webseite herauskommt? Wenn dieses Endprodukt zudem vom Webbrowser aus passend auf eine DIN-A4-Seite gedruckt oder als PDF gespeichert werden kann?

Wie wäre es, wenn als Dokumenten-Generator-Sprache eine *vollwertige* Programmiersprache zum Einsatz käme? Wenn diese Sprache zudem an die Domänengegebenheit die durch den Willen ein Dokument zu verfassen geprägt ist?

Was kann man alles damit anstellen?

* Vermischung von statischen und automatisch generierten Dokumenten-Bestandteilen,
* Datenaufbereitung quasi zur Laufzeit der Dokumenten-Erstellung,
* Strukturierungsmöglichkeiten durch den Quellcode, in Pakete, Klassen -> Objekt-Orientierung,
* Webtechnologie ermöglicht dynamische Inhalte,
* Webtechnologie ist reaktiv (z.B. auf den Benutzer, Inhalte nachladen),
* Gute Kolloberationsmöglichkeiten, Verwaltungsmöglichkeiten, da Source-Code
* Verknüpfung verschiedener Technologien (Datenbanken, Dateisystem, Interpozesskommunikation, etc.),
* Sehr flexible Gestaltung des Dokuments, da Webtechnologie möglich,
* Webtechnologie ermöglicht Rückkanal, z.B. kollaborierende Benutzer können Kommentare schreiben, oder mehr. (Richtung Google Docs.),
* Viele Erweiterungsmöglichkeiten, geg. durch Programmiersprache und Webtechnologie,
* Webtechnologie hat eine sichere Zukunft und ist standardisiert.

Es muss also ein kleines JavaScript-Framework entwickelt werden, welches die Aufgabe der Darstellung des Dokuments übernimmt. Die Zielachitektur.

Zudem braucht es noch ein Programm bzw. Programmiersprache, welches diese Zielarchitektur füttern kann. Dieses Programm soll Aufgaben wie z.B. Kapitel-Nummerierung automatisch abwickeln. Weiterhin muss es auch ein wohlgeformte Schnittstelle zum Benutzer liefern. Diese Kriterien führen dazu, dass die Entwicklung einer Domänen-Spezifischen Programmiersprache, kurz DSL, sehr sinnvoll ist.

## Weitere Entwicklung, Wendung, warum das SCAI es betreut und auch gebrauchen kann

Als ich soweit an der Thematik getüftelt hatte und die Machbarkeit als Bachelor-Thesis erkannte trug ich den Vorschlag am ISE vor, jedoch sind diese kein Informatik Institut und sahen sich nicht in der Lage die Arbeit zu betreuen, wenngleich sie die Idee sehr nützlich fanden. So wurde mir nahe gelegt, dass ich bei einem anderen Fraunhofer Institut anklopfen könne.

Ich habe das Fraunhofer SCAI angeschrieben, und Dr. Marc Zimmermann fand die Idee spannend und auch passend für deren Themengebiet. Sie bereiten u.a. Patente auf, indem sie eine Patent-PDF-Datei mit Hilfe ihres Java-Framework zerlegen und die so erhaltenen Daten ggf. mit zusätzlichen Informationen anreichern. Die Idee von mir hat ihnen sehr zugesagt, da sie noch eine Möglichkeit suchten, die die aufbereiteten Patente mit Webtechnologie darzustellen kann bzw. auszuliefern.