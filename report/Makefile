LATEX:=latex

DOCUMENT:=report
SOURCES:=$(filter-out preamble.tex,$(shell ls *.tex))

.SECONDARY: $(addsuffix .fmt,$(DOCUMENT))
.PHONY: clean

all: $(DOCUMENT).pdf

%.pdf: %.dvi
	dvipdfm $<

%.dvi: %.tex %.fmt $(SOURCES)
	$(LATEX) $(basename $@)
	$(LATEX) $(basename $@)
	$(LATEX) $(basename $@)

%.fmt: preamble.tex
	$(LATEX) -ini -jobname="$(basename $@)" "&$(LATEX) $<\dump"

clean:
	$(RM) -v $(addprefix $(DOCUMENT).,fmt aux bbl blg dvi log out toc pdf)
